package ${package}.provider.mapper;

import com.einwin.framework.mapper.GenericMapper;
import ${package}.api.model.DemoModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper  extends GenericMapper<DemoModel, String> {

}