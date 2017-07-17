/**
 * @author Cool-Coding 2017/7/17
 */
public enum RType {
    qingjia{
        @Override
        public String toString() {
            return "请假";
        }
    },
    zhangxin{
        @Override
        public String toString() {
            return "涨薪";
        }
    }
}
