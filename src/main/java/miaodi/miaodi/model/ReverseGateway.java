package miaodi.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2020-04-27
 */
@TableName("REVERSE_GATEWAY")
public class ReverseGateway extends Model<ReverseGateway> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ID")
    private Long id;
    /**
     * 通道ID
     */
    @TableField("CHANNEL_ID")
    private Long channelId;
    /**
     * 绑定的ip 可以多个 逗号分隔
     */
    @TableField("BIND_IP")
    private String bindIp;
    /**
     * 绑定的端口  是一个区间 并且不可重复
     */
    @TableField("BIND_PORT")
    private String bindPort;
    /**
     * 创建时间
     */
    @TableField("GMT_CREATE")
    private Long gmtCreate;
    /**
     * 创建用户
     */
    @TableField("CREATE_USER_ID")
    private Long createUserId;
    /**
     * 最后修改时间
     */
    @TableField("GMT_MODIFY")
    private Long gmtModify;
    /**
     * 最后修改人
     */
    @TableField("MODIFY_USER_ID")
    private Long modifyUserId;
    /**
     * 备忘录
     */
    @TableField("MEMO")
    private String memo;
    /**
     * 1.是 0.否
     */
    @TableField("DELETED")
    private Integer deleted;
    /**
     * 1 开启  0关闭
     */
    @TableField("STATUS")
    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getBindIp() {
        return bindIp;
    }

    public void setBindIp(String bindIp) {
        this.bindIp = bindIp;
    }

    public String getBindPort() {
        return bindPort;
    }

    public void setBindPort(String bindPort) {
        this.bindPort = bindPort;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Long gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ReverseGateway{" +
        ", id=" + id +
        ", channelId=" + channelId +
        ", bindIp=" + bindIp +
        ", bindPort=" + bindPort +
        ", gmtCreate=" + gmtCreate +
        ", createUserId=" + createUserId +
        ", gmtModify=" + gmtModify +
        ", modifyUserId=" + modifyUserId +
        ", memo=" + memo +
        ", deleted=" + deleted +
        ", status=" + status +
        "}";
    }
}
