package com.example.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * ClassName: Dept <br/>
 * Description: TODO <br/>
 * Date: 2018/9/11 11:28 <br/>
 *
 * @author Kaixuan Tang
 * @version 1.0.0
 * @since 1.8
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private static final long serialVersionUID = 929066919904742542L;

    private Long deptNo;
    private String dName;
    private String dbSource;

    public static void main(String[] args) {

    }
}
