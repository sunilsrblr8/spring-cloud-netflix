/*
 * Copyright 2013-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.hystrix;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author Venil Noronha
 */
@Data
@ConfigurationProperties("hystrix.metrics")
public class HystrixMetricsProperties {

	/** Enable Hystrix metrics polling. Defaults to true. */
	private boolean enabled = true;

	/** Interval between subsequent polling of metrics. Defaults to 2000 ms. */
	private Integer pollingIntervalMs = 2000;

}
