import java.util.ArrayList;

public class SetItem implements Item {
    String name = "";
    ArrayList<SingleItem> items = new ArrayList<SingleItem>();

    @Override
    public String getName() {
        String newName = this.name + "(";
        for (int i = 0; i < items.size(); i++) {
            if (i < items.size() - 1) {
                newName += items.get(i).getName() + ",";
            } else {
                newName += items.get(i).getName();
            }
        }
        newName += ")";
        return newName;
    }
}