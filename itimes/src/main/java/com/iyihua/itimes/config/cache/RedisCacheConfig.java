package com.iyihua.itimes.config.cache;

import java.util.HashSet;
import java.util.Set;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

@Configuration
//@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {

	@Bean
	public JedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();

		// Defaults
//		redisConnectionFactory.setHostName("127.0.0.1");
		redisConnectionFactory.setHostName("192.168.1.134");
		redisConnectionFactory.setPort(6379);
//		redisConnectionFactory.setPort(7000);
		return redisConnectionFactory;
	}
	
//	@Bean
//    public JedisCluster jedisCluster (){  
//        Set<HostAndPort> set = new HashSet<>();  
//        set.add(new HostAndPort("192.168.1.128", 7000)); 
//        set.add(new HostAndPort("192.168.1.128", 7001)); 
//        set.add(new HostAndPort("192.168.1.128", 7002)); 
//        JedisCluster jedisCluster = new JedisCluster(set);  
//        return jedisCluster;  
//    } 

	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory cf) {
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
		redisTemplate.setConnectionFactory(cf);
		return redisTemplate;
	}

	@SuppressWarnings("rawtypes")
	@Bean(name = "redisCacheManager")
	public CacheManager cacheManager(RedisTemplate redisTemplate) {
		RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);

		// Number of seconds before expiration. Defaults to unlimited (0)
		cacheManager.setDefaultExpiration(300);
		return cacheManager;
	}
}
