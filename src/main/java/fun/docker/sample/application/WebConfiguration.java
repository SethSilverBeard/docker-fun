package fun.docker.sample.application;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by seth on 11/16/16.
 */
@Configuration
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		GsonHttpMessageConverter gsonMessageConverter = new GsonHttpMessageConverter();
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		gsonMessageConverter.setGson(prettyGson);
		converters.add(gsonMessageConverter);
	}

}
