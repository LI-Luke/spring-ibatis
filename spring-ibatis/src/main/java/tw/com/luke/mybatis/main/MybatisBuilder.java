package tw.com.luke.mybatis.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.NullProgressCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MybatisBuilder {
	private static final Logger log = LoggerFactory.getLogger(BisBuilder.class);
	public static void main(String[] args) {
		try {
			File xmlSource = new File("src/main/resources/tw/com/senao/ec/mapper/bis");
			log.warn("Delete bis xml folder");
			if(xmlSource.isDirectory() && xmlSource.exists()) {
				FileUtils.deleteDirectory(xmlSource);
			}
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			File configFile = new File("src/main/resources/generator-config.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(new NullProgressCallback());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}
