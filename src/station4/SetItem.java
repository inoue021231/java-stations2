import java.util.ArrayList;

public class SetItem extends Item {
  ArrayList<Item> items = new ArrayList<Item>();

  @Override
  public String getName() {
    String newName = this.name + "(";
    for (Item item : items) {
      newName += item.getName() + ",";
    }
    newName += ")";
    return newName;
  }
}
