#NoEnv 
SetWorkingDir %A_ScriptDir%
#Include *i Gdip.ahk

zz = C:\test.txt
FileReadLine, line, %zz% , 1
file = %line%

WinActivate, ahk_exe chrome.exe
WinWaitActive,ahk_exe chrome.exe,,2
WinGet, hwnd,ID,A
CoordMode, Pixel,Client

if WinExist("ahk_exe chrome.exe"){

;screen capture
	winget, hwnd
	pToken:=Gdip_Startup()
	raster:=0x40000000 + 0x00CC0020
	;pBitmap:=Gdip_BitmapFromScreen(0, raster)
	pBitmap:=Gdip_BitmapFromHWND(hwnd)
	
	W:= Gdip_GetImageWidth( pBitmap ), H:= Gdip_GetImageHeight( pBitmap )

	;pBitmap_part := Gdip_CloneBitmapArea(pBitmap, 0, 7/100*h, w, h-(11/100*h))

	Gdip_SaveBitmapToFile(pBitmap, file)
	;Gdip_SaveBitmapToFile(pBitmap_part, file)
	Gdip_DisposeImage(pBitmap)
	;Gdip_DisposeImage(pBitmap_part)
	Gdip_Shutdown(pToken)
	
	}else{
	MsgBox, windows doesn't exist
}
exitapp

