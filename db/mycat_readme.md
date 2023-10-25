## 关于mycat1.6配置说明

```xml
schema.xml
只配置一个demo暂时，还在考虑是否要换数据库选型。例如doris，pgsql，polardb，tidb等，mycat+mysql较为麻烦。后续调整及自动化配置脚本，静待更新。
目前的思路是垂直分库，各个微服务访问自己的库。水平分表，规则的id mod 2。

<schema name="MAIN_DATA" checkSQLschema="false" sqlMaxLimit="100">
    <table name="material" primaryKey="id" dataNode="material1,material2" rule="mod_rule" autoIncrement="true">
        <childTable name="material_type" primaryKey="material_type_id" joinKey="material_id" parentKey="material_id"></childTable>
    </table>
    <table name="product" primaryKey="id" dataNode="product1,product2" rule="mod_rule" autoIncrement="true"></table>
</schema>

<dataNode name="material1" dataHost="MASTER_DATA1" database="master_data1" />
<dataNode name="product1" dataHost="MASTER_DATA2" database="master_data1" />

<dataNode name="material2" dataHost="MASTER_DATA1" database="master_data2" />
<dataNode name="product2" dataHost="MASTER_DATA2" database="master_data2" />

<dataHost name="MASTER_DATA1" maxCon="1000" minCon="10" balance="0"
          writeType="0" dbType="mysql" dbDriver="jdbc" switchType="1"  slaveThreshold="100">
    <heartbeat>select user()</heartbeat>
    <writeHost host="MASTER_DATAM1" url="jdbc:mysql://10.3.7.201:3306" user="root" password="root">
        <readHost host="MASTER_DATAS1" url="10.3.7.202:3306" user="root" password="root"/>
    </writeHost>
</dataHost>

<dataHost name="MASTER_DATA2" maxCon="1000" minCon="10" balance="0"
          writeType="0" dbType="mysql" dbDriver="jdbc" switchType="1"  slaveThreshold="100">
    <heartbeat>select user()</heartbeat>
    <writeHost host="MASTER_DATAM2" url="jdbc:mysql://10.3.7.203:3306" user="root" password="root">
        <readHost host="MASTER_DATAS2" url="10.3.7.204:3306" user="root" password="root"/>
    </writeHost>
</dataHost>
```

```xml
server.xml
暂时只配demo，关于连接池、防火墙等及自动化配置脚本，静待更新。
<user name="root" defaultAccount="true">
    <property name="password">123456</property>
    <property name="schemas">MAIN_DATA</property>
    <property name="defaultSchema">MAIN_DATA</property>
</user>
```

```xaml
rule.xml
暂时只配demo，关于细节优化及自动化配置脚本，静待更新。
<tableRule name="mod_rule">
    <rule>
        <columns>id</columns>
        <algorithm>mod-long</algorithm>
    </rule>
</tableRule>

<function name="mod-long" class="io.mycat.route.function.PartitionByMod">
    <!-- how many data nodes -->
    <property name="count">2</property>
</function>
```

