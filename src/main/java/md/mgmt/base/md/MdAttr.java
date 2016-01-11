package md.mgmt.base.md;

/**
 * Created by Mr-yang on 16-1-9.
 * 元数据属性信息
 */
public class MdAttr {

    private String name;
    private Short acl;
    private Integer size;
    private Long createTime;
    private Long updateTime;
    private Object otherAttrs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAcl() {
        return acl;
    }

    public void setAcl(Short acl) {
        this.acl = acl;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Object getOtherAttrs() {
        return otherAttrs;
    }

    public void setOtherAttrs(Object otherAttrs) {
        this.otherAttrs = otherAttrs;
    }

    @Override
    public String toString() {
        return "MdAttr{" +
                "name='" + name + '\'' +
                ", acl=" + acl +
                ", size=" + size +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", otherAttrs=" + otherAttrs +
                '}';
    }
}
