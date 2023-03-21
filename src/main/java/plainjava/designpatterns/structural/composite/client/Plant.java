package plainjava.designpatterns.structural.composite.client;

import plainjava.designpatterns.structural.composite.composite.Branch;
import plainjava.designpatterns.structural.composite.leaf.Bud;
import plainjava.designpatterns.structural.composite.leaf.Leaf;

public class Plant {

    public static void main(String[] args) {
        Bud bud = new Bud();
        Leaf leaf = new Leaf();

        Branch childBranch1 = new Branch();
        childBranch1.addPlantItem(leaf);
        childBranch1.addPlantItem(bud);
        childBranch1.addPlantItem(leaf);
        childBranch1.addPlantItem(bud);

        Branch childBranch2 = new Branch();
        childBranch2.addPlantItem(leaf);
        childBranch2.addPlantItem(bud);
        childBranch2.addPlantItem(leaf);

        Branch mainBranch = new Branch();
        mainBranch.addPlantItem(childBranch1);
        mainBranch.addPlantItem(childBranch2);
        mainBranch.addPlantItem(bud);

        System.out.println("The plant consists of " + mainBranch.getAmount() + " leafs and buds.");
    }
}
