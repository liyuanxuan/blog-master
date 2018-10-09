/*
 * Copyright 2016 qyh.me
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.qyh.blog.core.vo;

import java.util.ArrayList;
import java.util.List;

import me.qyh.blog.core.service.ArticleService;
import me.qyh.blog.core.service.NewsService;
import me.qyh.blog.template.service.TemplateService;

public class CommentStatistics {

	private List<CommentModuleStatistics> modules = new ArrayList<>();

	public void addModule(CommentModuleStatistics st) {
		this.modules.add(st);
	}

	public List<CommentModuleStatistics> getModules() {
		return modules;
	}

	/**
	 * 适配以前
	 * 
	 * @return
	 */
	public int getTotalArticleComments() {
		return getComments(ArticleService.COMMENT_MODULE_NAME);
	}

	/**
	 * 适配以前
	 * 
	 * @return
	 */
	public int getTotalPageComments() {
		return getComments(TemplateService.COMMENT_MODULE_NAME);
	}

	public int getNewsComments() {
		return getComments(NewsService.COMMENT_MODULE_NAME);
	}

	public int getComments(String type) {
		for (CommentModuleStatistics module : modules) {
			if (module.getType().equals(type)) {
				return module.getCount();
			}
		}
		return 0;
	}

}