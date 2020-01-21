package com.ozm.omy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author qianduoduo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
@Component
public class User implements Serializable {
    private Integer id;
    private String userName;
    private Integer mobile;

}
