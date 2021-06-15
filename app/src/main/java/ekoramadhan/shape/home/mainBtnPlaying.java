package ekoramadhan.shape.home;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import ekoramadhan.linedeer.player.Ui;public class mainBtnPlaying extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(40f, 0f);			quadTo(53f, 0f, 53f, 13f);			lineTo(53f, 75.3f);			quadTo(53f, 88.3f, 40f, 88.3f);			lineTo(13f, 88.3f);			quadTo(0f, 88.3f, 0f, 75.3f);			lineTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(40f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(33.05f, 32.15f);			quadTo(33.5f, 32.6f, 33.5f, 33.2f);			lineTo(33.5f, 55.15f);			quadTo(33.5f, 55.75f, 33.05f, 56.2f);			quadTo(32.6f, 56.65f, 32f, 56.65f);			lineTo(31f, 56.65f);			quadTo(30.4f, 56.65f, 29.95f, 56.2f);			quadTo(29.5f, 55.75f, 29.5f, 55.15f);			lineTo(29.5f, 33.2f);			quadTo(29.5f, 32.6f, 29.95f, 32.15f);			quadTo(30.4f, 31.7f, 31f, 31.7f);			lineTo(32f, 31.7f);			quadTo(32.6f, 31.7f, 33.05f, 32.15f);	}}class Path2 extends Path{  	public Path2() {			moveTo(23.05f, 32.15f);			quadTo(23.5f, 32.6f, 23.5f, 33.2f);			lineTo(23.5f, 55.15f);			lineTo(23.05f, 56.2f);			quadTo(22.6f, 56.65f, 22f, 56.65f);			lineTo(21f, 56.65f);			quadTo(20.4f, 56.65f, 19.95f, 56.2f);			quadTo(19.5f, 55.75f, 19.5f, 55.15f);			lineTo(19.5f, 33.2f);			quadTo(19.5f, 32.6f, 19.95f, 32.15f);			quadTo(20.4f, 31.7f, 21f, 31.7f);			lineTo(22f, 31.7f);			quadTo(22.6f, 31.7f, 23.05f, 32.15f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00d35d69); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFffffff); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFffffff); 		public Path2 S2 = new Path2();		public static float Ht = 88.3F; 		public static float Wh = 53F;  		public mainBtnPlaying(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00d35d69);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFffffff);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFffffff);			P2.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final mainBtnPlaying viewImg = new mainBtnPlaying(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static mainBtnPlaying getShape(){		   final mainBtnPlaying viewImg = new mainBtnPlaying(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 