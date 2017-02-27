package BattleTrail_2098;

/**
 * Handles player class related data
 * Created by victor on 2017-02-27.
 */
public class Classes {
    String Class;
    String classDescription;

    /**
     *
     * @param Class name of player class
     * @param classDescription a description of class properties
     */
    Classes(String Class, String classDescription) {
        this.Class = Class;
        this.classDescription = classDescription;
    }

    /**
     * returns classname
     * @return
     */
    public String getClassname() {
        return Class;
    }

    /**
     * returns classdescription
     * @return
     */
    public String getClassDescription() {
        return classDescription;
    }

}
