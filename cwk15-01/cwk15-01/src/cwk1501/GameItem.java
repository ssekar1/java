/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1501;

/**
 *
 * @author apatel15
 */
public abstract class GameItem {
    protected String description;
    protected String name;
    protected int value;
    public GameItem () {
        this.description="None";
        this.name="Unnamed";
        this.value=0;
    }

    public GameItem(String description, String name, int value) {
        this.description = description;
        this.name = name;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GameItem{" + "description=" + description + "name=" + name + "value=" + value + '}';
}
    public abstract boolean pickup() ;
    public abstract boolean putdown() ;
}
