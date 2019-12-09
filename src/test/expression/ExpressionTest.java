package expression;

import com.range.stcfactor.common.utils.FileUtils;
import org.nd4j.linalg.api.ndarray.INDArray;

import static com.range.stcfactor.expression.ExpFunctions.*;

/**
 * @author renjie.zhu@woqutech.com
 * @create 2019-12-09
 */
public class ExpressionTest {

    public static void main(String[] args) {
        String dataPath = "D:\\Work\\Project\\Java\\stochastic-factor\\data\\";
        test(dataPath);
    }

    private static void test(String path) {
        INDArray open = FileUtils.readData(path + "open.csv");
        INDArray high = FileUtils.readData(path + "high.csv");
        INDArray low = FileUtils.readData(path + "low.csv");
        INDArray close = FileUtils.readData(path + "close.csv");
        INDArray vol = FileUtils.readData(path + "vol.csv");
        INDArray share = FileUtils.readData(path + "share.csv");
        INDArray turnover = FileUtils.readData(path + "turnover.csv");

        long startTime = System.currentTimeMillis();
        System.out.println(mul(div(regBeta(relu(share),share,98),wma(close,65)),regResi(square(corr(open,high,102)),corr(close,rankPct(turnover),206),128)));
        System.out.println("==================================================================================> cost "
                + (System.currentTimeMillis() - startTime) / 1000 + "s");
    }

}
