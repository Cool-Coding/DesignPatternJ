/**
 * @author Cool-Coding 2017/7/14
 */
public enum Food {
    yangrouchuan{
        @Override
        public float getPrice() {
            return 2;
        }

        @Override
        public String toString() {
            return "羊肉串";
        }
    },
    mianjin{
        @Override
        public float getPrice() {
            return 1;
        }

        @Override
        public String toString() {
            return "面筋";
        }
    },
    jichi{
        @Override
        public float getPrice() {
            return 3;
        }

        @Override
        public String toString() {
            return "鸡翅";
        }
    },
    pijiu {
        @Override
        public float getPrice() {
            return 6;
        }

        @Override
        public String toString() {
            return "啤酒";
        }
    };

    public abstract float getPrice();
}
