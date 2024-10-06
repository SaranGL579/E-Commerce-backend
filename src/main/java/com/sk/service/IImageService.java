package com.sk.service;

import org.springframework.web.multipart.MultipartFile;

import com.sk.dto.ImageDto;
import com.sk.model.Image;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}