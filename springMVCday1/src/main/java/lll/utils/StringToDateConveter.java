package lll.utils;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class StringToDateConveter implements Converter<String, Date> {


    @Override
    public Date  convert(String source) {
        if(source==null)
        {
            throw new RuntimeException("没有数据");
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据转换错误");
        }
    }
}
