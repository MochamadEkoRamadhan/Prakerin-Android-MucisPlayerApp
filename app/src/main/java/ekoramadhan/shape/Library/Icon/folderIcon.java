package ekoramadhan.shape.Library.Icon;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import ekoramadhan.linedeer.player.Ui;import android.graphics.Paint;import android.graphics.Canvas;public class folderIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(37f, 0f);			quadTo(50f, 0f, 50f, 13f);			lineTo(50f, 37f);			quadTo(50f, 50f, 37f, 50f);			lineTo(13f, 50f);			quadTo(0f, 50f, 0f, 37f);			lineTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(37f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(40.7f, 16.35f);			lineTo(40.7f, 18.25f);			lineTo(40.7f, 18.55f);			lineTo(9.3f, 18.55f);			lineTo(9.3f, 18.25f);			lineTo(9.3f, 16.35f);			quadTo(9.4f, 13.05f, 12.8f, 13.05f);			lineTo(14.9f, 13.05f);			lineTo(14.85f, 12.7f);			quadTo(14.85f, 11.85f, 15.4f, 11.35f);			quadTo(15.9f, 10.8f, 16.7f, 10.8f);			lineTo(24.25f, 10.8f);			quadTo(25.05f, 10.8f, 25.6f, 11.35f);			quadTo(26.15f, 11.85f, 26.15f, 12.7f);			lineTo(26.1f, 13.05f);			lineTo(37.25f, 13.05f);			lineTo(38.25f, 13.15f);			quadTo(39.4f, 13.3f, 40.05f, 14.1f);			quadTo(40.65f, 14.95f, 40.7f, 16.35f);	}}class Path2 extends Path{  	public Path2() {			moveTo(40.7f, 16.8f);			quadTo(43.25f, 17.45f, 43f, 20.5f);			lineTo(43f, 20.65f);			lineTo(41.65f, 36.1f);			quadTo(41.35f, 39.25f, 37.7f, 39.25f);			lineTo(12.3f, 39.25f);			lineTo(10.45f, 39f);			lineTo(9.55f, 38.55f);			quadTo(8.55f, 37.7f, 8.4f, 36.1f);			lineTo(7.1f, 20.65f);			lineTo(7.05f, 20.5f);			quadTo(6.8f, 17.45f, 9.3f, 16.8f);			lineTo(10.75f, 16.65f);			lineTo(39.25f, 16.65f);			lineTo(40.7f, 16.8f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00695b99); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFebebec); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFffffff); 		public Path2 S2 = new Path2();		public static float Ht = 50F; 		public static float Wh = 50F;  		public folderIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00695b99);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFebebec);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFffffff);			P2.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final folderIcon viewImg = new folderIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static folderIcon getShape(){		   final folderIcon viewImg = new folderIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 