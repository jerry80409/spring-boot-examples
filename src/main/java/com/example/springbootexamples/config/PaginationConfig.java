package com.example.springbootexamples.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.support.DomainClassConverter;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

/**
 * @EnableSpringDataWebSupport
 * 支援 {@link DomainClassConverter} Controller 可在不手動引入 Repository 的狀態, 去查詢 entity 資料;
 * 支援 {@link PageableHandlerMethodArgumentResolver} 相關 pageable 的處理,
 * Controller 可在 method's parameter 使用 {@link Pageable}, {@link org.springframework.data.web.PageableDefault}
 * 支援 {@link}
 *
 * https://www.baeldung.com/spring-data-web-support
 */
@Configuration
@EnableSpringDataWebSupport
class PaginationConfig {

}
