package md.mgmt.base.md;

/**
 * Created by Mr-yang on 16-1-9.
 * 元数据索引信息
 */
public class MdIndex {

    private String path;

    private String name;

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

    @Override
    public String toString() {
        return "MdIndex{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
