import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamIterate {

    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();

        Stream.iterate(0, i -> i + 2)
                .limit(6)
                .forEach(values::add);

        assert(values.size() == 6);
        assert(values.get(0) == 0);
        assert(values.get(1) == 2);
        assert(values.get(2) == 4);
        assert(values.get(3) == 6);
        assert(values.get(4) == 8);
        assert(values.get(5) == 10);
    }

}

