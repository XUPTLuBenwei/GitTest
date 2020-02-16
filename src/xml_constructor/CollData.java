package xml_constructor;

import java.util.*;

public class CollData {
    private String[] strings;
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<String ,String > stringMap;
    Properties properties;

    @Override
    public String toString() {
        return "CollData{" +
                "strings=" + Arrays.toString(strings) +
                ", stringList=" + stringList +
                ", stringSet=" + stringSet +
                ", stringMap=" + stringMap +
                ", properties=" + properties +
                '}';
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
