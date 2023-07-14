package com.example.starts.jsonplaceholder;

import lombok.Data;

public record Post(Integer userId, Integer id, String title, String body) {
}
