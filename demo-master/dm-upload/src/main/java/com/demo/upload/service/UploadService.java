package com.demo.upload.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author jensen
 * @date 2016/9/16
 */
public interface UploadService {

    String uploadImage(MultipartFile file);
}
