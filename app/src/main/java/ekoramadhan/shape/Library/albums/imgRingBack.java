package ekoramadhan.shape.Library.albums;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import ekoramadhan.linedeer.player.Ui;import android.graphics.Paint;import android.graphics.Canvas;public class imgRingBack extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(150f, 150f);			lineTo(0f, 150f);			lineTo(0f, 0f);			lineTo(150f, 0f);			lineTo(150f, 150f);	}}class Path1 extends Path{  	public Path1() {			moveTo(81.1f, 63.4f);			lineTo(80.45f, 63.4f);			lineTo(75f, 62.35f);			quadTo(71.65f, 62f, 68.75f, 60.85f);			lineTo(82.35f, 84.5f);			quadTo(83.5f, 87.45f, 82.6f, 90f);			lineTo(82.6f, 90.35f);			quadTo(81.2f, 93.05f, 78.3f, 94.55f);			lineTo(76.9f, 95.45f);			lineTo(75.25f, 95.45f);			quadTo(73.85f, 94.95f, 73.05f, 93.4f);			quadTo(72.3f, 92f, 72.45f, 90.35f);			lineTo(72.7f, 89.6f);			quadTo(73.6f, 85.9f, 78.55f, 83.1f);			lineTo(62f, 54.6f);			quadTo(62f, 54.45f, 62.35f, 54.6f);			lineTo(67.1f, 55.75f);			lineTo(76.9f, 57.15f);			quadTo(84.65f, 57.75f, 86.95f, 61.35f);			lineTo(87.6f, 63.4f);			quadTo(88.5f, 66.3f, 87.45f, 70f);			lineTo(85.55f, 74.95f);			lineTo(84.25f, 76.75f);			lineTo(83.5f, 76.5f);			lineTo(83.4f, 76.5f);			lineTo(83.5f, 76.1f);			lineTo(84.15f, 74.85f);			quadTo(84.9f, 72.65f, 85.15f, 70.4f);			quadTo(85.55f, 67.85f, 84.25f, 65.9f);			lineTo(83.5f, 64.9f);			quadTo(82.75f, 63.9f, 81.35f, 63.5f);			lineTo(81.1f, 63.4f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFF54497c); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xfcffffff); 		public Path1 S1 = new Path1();		public static float Ht = 150F; 		public static float Wh = 150F;  		public imgRingBack(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFF54497c);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xfcffffff);			P1.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final imgRingBack viewImg = new imgRingBack(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static imgRingBack getShape(){		   final imgRingBack viewImg = new imgRingBack(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 