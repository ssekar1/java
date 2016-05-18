/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk23031;

/**
 *
 * @author apatel15
 */
public class AniSizeShape implements AniStrategy{
    protected int wh;
    protected int hh;



    public AniSizeShape(int wh, int hh) {
        this.wh = wh;
        this.hh = hh;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getWh() {
        return wh;
    }

    public void setWh(int wh) {
        this.wh = wh;
    }

  public void update(AShape a) {
        a.setWidth(a.getWidth() + wh);
        a.setHeight(a.getHeight() + hh);
    }

}
