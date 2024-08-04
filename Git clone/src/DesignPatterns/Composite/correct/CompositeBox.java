package DesignPatterns.Composite.correct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{


    private  final ArrayList<Box> elements = new ArrayList<>();

    public CompositeBox(Box ...boxes){
        elements.addAll(Arrays.asList(boxes));
    }

    @Override
    public Double calculate() {
        return elements.stream().mapToDouble(Box :: calculate).sum();
    }
}
