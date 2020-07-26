package com.fj.commons.sha.helper;

public interface SHA {
	DigestSHA<String> stringResult();
	DigestSHA<byte[]> bytesResult();
}
