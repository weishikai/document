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
		//���ö�ά����
		int width=300;
		//���ö�ά��߶�
		int height=300;
		//����ͼƬ��ʽ
		String format="png";
		//���ö�ά�����Ϣ����,����ɨ�˶�ά�����ֵ�����
		String content="http://www.baidu.com";
		createQRcode(width,height,format,content);
		
	}
	
	private static void createQRcode(int width,int height,String format,String content){
		//�����¶�ά��Ĳ���
		Map hint=new HashMap();
		//���ö�ά��ı��뷽ʽ
		hint.put(EncodeHintType.CHARACTER_SET, "utf-8");
		//���ö�ά��ľ���ȼ�,�ȼ�Խ��,�ɴ洢��������Խ��
		//L,M,Q,H���ĸ��ȼ��ɵ͵���
		hint.put(EncodeHintType.CHARACTER_SET, ErrorCorrectionLevel.M);
		//���ö�ά��ı߾� Ҳ��������Ŀհױ߿��С
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

