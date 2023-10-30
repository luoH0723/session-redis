package com.lh.sessionredis.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @BelongsProject: session-redis
 * @BelongsPackage: com.lh.sessionredis.configuration
 * @Author: LHao
 * @CreateTime: 2023-10-30  17:56
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
@EnableCaching
@EnableRedisHttpSession
public class RedisSessionConfiguration {
}
