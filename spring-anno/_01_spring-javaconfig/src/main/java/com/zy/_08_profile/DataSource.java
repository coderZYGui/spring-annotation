package com.zy._08_profile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 11:05
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
public class DataSource {

    private String username;
    private String password;
    private String url;
}
