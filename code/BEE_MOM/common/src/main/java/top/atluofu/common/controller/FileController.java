package top.atluofu.common.controller;

import io.minio.messages.Bucket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.atluofu.common.config.MinioConfig;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.common.utils.MinIOUtil;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: FileController
 * @description: FileController
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-14:39
 * @Version: 1.0
 */

@Slf4j
@RestController
@RequestMapping(value = "file")
public class FileController {
    private final MinIOUtil minioUtil;
    private final MinioConfig prop;

    public FileController(MinIOUtil minioUtil, MinioConfig prop) {
        this.minioUtil = minioUtil;
        this.prop = prop;
    }

    /**
     * 检查存储桶是否存在
     *
     * @param bucketName 存储桶名称
     * @return 检查结果
     */
    @GetMapping("/bucketExists")
    public ResultUtils bucketExists(@RequestParam("bucketName") String bucketName) throws Exception {
        HashMap<String, Boolean> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("bucketName", minioUtil.bucketExists(bucketName));
        return ResultUtils.success(objectObjectHashMap);
    }


    @GetMapping("/makeBucket")
    public ResultUtils makeBucket(String bucketName) {
        HashMap<String, Boolean> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("bucketName", minioUtil.makeBucket(bucketName));
        return ResultUtils.success(objectObjectHashMap);
    }

    @GetMapping("/removeBucket")
    public ResultUtils removeBucket(String bucketName) throws Exception {
        HashMap<String, Boolean> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("bucketName", minioUtil.removeBucket(bucketName));
        return ResultUtils.success(objectObjectHashMap);
    }

    @GetMapping("/getAllBuckets")
    public ResultUtils getAllBuckets() throws Exception {
        HashMap<String, List<Bucket>> objectObjectHashMap = new HashMap<>();
        List<Bucket> allBuckets = minioUtil.getAllBuckets();
        objectObjectHashMap.put("allBuckets", allBuckets);
        return ResultUtils.success(objectObjectHashMap);
    }

    @PostMapping("/upload")
    public ResultUtils upload(@RequestParam("file") MultipartFile file, String fileName, String bucketName,
                              String objectName, String contentType, Integer expires) throws Exception {
        minioUtil.uploadFile(bucketName, file, objectName, contentType);
        if (null != objectName) {
            return ResultUtils.success(minioUtil.getPresignedObjectUrl(bucketName, objectName, expires));
        }
        return ResultUtils.error(501, "上传失败");
    }

    @GetMapping("/preview")
    public ResultUtils preview(String bucketName, String objectName) throws Exception {
        return ResultUtils.success(minioUtil.getFileStatusInfo(bucketName, objectName));
    }

    @GetMapping("/download")
    public ResultUtils download(String bucketName, String objectName, long offset, long length) throws Exception {
        InputStream object = minioUtil.getObject(bucketName, objectName, offset, length);
        return ResultUtils.success(object);
    }

    @PostMapping("/delete")
    public ResultUtils remove(String bucketName, String objectName) throws Exception {
        minioUtil.removeFile(bucketName, objectName);
        return ResultUtils.success("success remove file");
    }
}
