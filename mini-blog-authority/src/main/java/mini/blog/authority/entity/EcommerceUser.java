package mini.blog.authority.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2022/4/4 22:14
 */

/**
 * <h1>用户表实体类定义</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_ecommerce_user")
public class EcommerceUser implements Serializable {


    /**
     * 自增主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * MD5 密码
     */
    private String password;

    /**
     * 额外的信息, json 字符串存储
     */
    private String extraInfo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
