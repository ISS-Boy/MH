package cn.issboy.mengine.core.parser;

/**
 * Auto-generated: 2018-04-24 20:24:26
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Source extends Node{

    private String sourceName;

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceName() {
        return sourceName;
    }

    @Override
    protected void accept(MonitorVisitor visitor) {
        visitor.visitSource(this);
    }

    @Override
    public String toString() {
        return "Source{" +
                "sourceName='" + sourceName + '\'' +
                '}';
    }
}
