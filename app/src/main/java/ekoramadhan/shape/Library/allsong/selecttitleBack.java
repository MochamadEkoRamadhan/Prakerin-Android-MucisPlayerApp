package ekoramadhan.shape.Library.allsong;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import ekoramadhan.linedeer.player.Ui;import android.graphics.Paint;import android.graphics.Canvas;public class selecttitleBack extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(0f, 0f);			lineTo(360f, 0f);			lineTo(360f, 640f);			lineTo(0f, 640f);			lineTo(0f, 0f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFF352f51); 		public Path0 S0 = new Path0();		public static float Ht = 640F; 		public static float Wh = 360F;  		public selecttitleBack(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFF352f51);			P0.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final selecttitleBack viewImg = new selecttitleBack(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static selecttitleBack getShape(){		   final selecttitleBack viewImg = new selecttitleBack(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 