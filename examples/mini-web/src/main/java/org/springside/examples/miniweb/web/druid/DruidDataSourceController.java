package org.springside.examples.miniweb.web.druid;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.stat.DruidDataSourceStatManager;

@Controller
@RequestMapping(value = "/druid/dataSource")
public class DruidDataSourceController {
	@RequestMapping(value = { "list", "" })
	public String list(Model model) {
		Set<DruidDataSource> dataSources = DruidDataSourceStatManager.getDruidDataSourceInstances();
		model.addAttribute("dataSources", dataSources);
		return "druid/dataSourceList";
	}
}
