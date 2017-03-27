package com.mycompany.test;

import com.mycompany.test.bean.dataBean.MyTestData;
import com.mycompany.test.bean.dataBean.SimpleData;
import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.DataResource;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.FileSystemResource;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by zipon on 2017/3/25.
 */
public class AppTest {
    @DataProvider(name = "dataa")
    public java.lang.Object[][] dataTest(){
        return new java.lang.Object[][]{
                { "", "", "账号不能为空" },
                { "admin"," " ,"密码不能为空" },
                { " ", "a123456","账号不能为空" },
                { "ad ", "123456","账号“ad”不存在" },
                { "admin","12345" ,"密码错误" },
        };
    }
    @DataProvider(name = "excelDataProvider")
    public java.lang.Object[][] getExcelDataProvider() throws Exception {
        DataResource resource =
                new FileSystemResource("src/test/resources/testData/MyDataFile.xls",SimpleData.class);
        SeLionDataProvider dataProvider =
                DataProviderFactory.getDataProvider(resource);
        SimpleData datarow = new SimpleData();
        return dataProvider.getAllData();
    }
//    @DataProvider(name = "excelDataProvider")
//    public java.lang.Object[][] getExcelDataProvider() throws Exception {
//        DataResource resource = new FileSystemResource("src\\test\\resources\\testData\\MyTestData.xls",MyTestData.class);
//        SeLionDataProvider dataProvider = DataProviderFactory.getDataProvider(resource);
//
//        return dataProvider.getAllData();
//    }
    @Test
    public void testMain() throws Exception {
        App.main(new String[]{"1", "2"});
        String abc = "angela";
        Assert.assertEquals(abc,"angela");
    }

    @Test(dataProvider = "excelDataProvider")
    public void testDataProvider(SimpleData data) throws Exception {

        Assert.assertEquals(data.getEmployeeName(),"a");
    }

    @Test(dataProvider = "dataa")
    public void testEcafeLogin(String userName,  String passWord, String expectText) {
        System.out.println(userName);
        Assert.assertEquals(userName,"");
    }
}