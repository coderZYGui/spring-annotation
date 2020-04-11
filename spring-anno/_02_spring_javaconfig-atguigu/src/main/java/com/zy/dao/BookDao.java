package com.zy.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:37
 */
@Repository("bookDao1") // id为首字母小写
@Getter
@Setter
@ToString
public class BookDao {

    private String lable = "1";

}
