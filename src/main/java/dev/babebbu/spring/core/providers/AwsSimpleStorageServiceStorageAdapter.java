package dev.babebbu.spring.core.providers;

import org.springframework.stereotype.Service;

@Service
public class AwsSimpleStorageServiceStorageAdapter implements StorageAdapter {
    @Override
    public String save(byte[] content) {
        return null;
    }
}