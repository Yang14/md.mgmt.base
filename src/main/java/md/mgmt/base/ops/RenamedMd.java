package md.mgmt.base.ops;

/**
 * Created by Mr-yang on 16-1-9.
 * 重命名元数据命令参数
 */
public class RenamedMd {
    /**
     * 路径
     */
    private String path;
    /**
     * 文件名
     */
    private String name;
    /**
     * 新文件名
     */
    private String newName;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public String toString() {
        return "RenamedMd{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", newName='" + newName + '\'' +
                '}';
    }
}