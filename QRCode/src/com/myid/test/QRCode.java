package com.myid.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QRCode {
	public static void main(String[] args){
		//设置二维码宽度
		int width=300;
		//设置二维码高度
		int height=300;
		//设置图片格式
		String format="png";
		//设置二维码的信息内容,就是扫了二维码后出现的连接
		String content="http://www.baidu.com";
		createQRcode(width,height,format,content);
		
	}
	
	private static void createQRcode(int width,int height,String format,String content){
		//设置下二维码的参数
		Map hint=new HashMap();
		//设置二维码的编码方式
		hint.put(EncodeHintType.CHARACTER_SET, "utf-8");
		//设置二维码的纠错等级,等级越高,可存储的数据量越少
		//L,M,Q,H这四个等级由低到高
		hint.put(EncodeHintType.CHARACTER_SET, ErrorCorrectionLevel.M);
		//设置二维码的边距 也就是外面的空白边框大小
		hint.put(EncodeHintType.MARGIN,2 );
		try{
			BitMatrix bitMatrix=new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hint);
			Path a=new File("E:/github/a.png").toPath();
			MatrixToImageWriter.writeToPath(bitMatrix, format, a);
		}catch(WriterException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

