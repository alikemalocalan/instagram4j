package com.github.instagram4j.instagram4j.models.media;

import lombok.Data;

@Data
public class ImageVersionsMeta implements Rectangle {
    private String url;
    private int width;
    private int height;
}
