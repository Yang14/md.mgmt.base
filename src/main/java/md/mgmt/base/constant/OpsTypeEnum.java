package md.mgmt.base.constant;

/**
 * Created by Mr-yang on 16-1-9.
 */
public enum OpsTypeEnum {
    /**
     * 创建文件命令
     */
    CREATE_FILE(1, "create_file"),

    /**
     * 创建目录命令
     */
    CREATE_DIR(2, "create_dir"),

    /**
     * 查找文件命令
     */
    FIND_FILE(3, "find_file"),

    /**
     * 列表目录
     */
    LIST_DIR(4, "list_dir"),

    /**
     * 重命名文件
     */
    RENAME_FILE(5, "rename_file");

    /**
     * 常量编码
     */
    private Integer code;
    /**
     * 常量描述信息
     */
    private String desc;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private OpsTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Integer getCode(String desc) {
        for (OpsTypeEnum c : OpsTypeEnum.values()) {
            if (c.getDesc().equals(desc)) {
                return c.code;
            }
        }
        return null;
    }
}
