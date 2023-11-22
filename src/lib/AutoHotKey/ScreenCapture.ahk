#NoEnv 
SetWorkingDir %A_ScriptDir%
#Include *i Gdip.ahk

zz = C:\Screens\CaptureFolderSilkBDS.txt
FileReadLine, line, %zz% , 1
file = %line%

WinActivate, ahk_exe ppdsql.exe
WinWaitActive,ahk_exe ppdsql.exe,,2

CoordMode, Pixel,Client

if WinExist("ahk_exe ppdsql.exe"){

;check for BDS-IDS is fully loaded
	;Loop{
	;Sleep 1000
	;PixelGetColor, color,638,0
	;}Until color = 0x808080
	
;screen capture
	winget, hwnd
	pToken:=Gdip_Startup()
	;MsgBox, this is hwnd 'n%hwnd%
	pBitmap:=Gdip_BitmapFromHWND(hwnd)
	;pBitmap_part:=Gdip_CloneBitmapArea(pBitmap, 0, 0, 100,100) ;sebagian
	;Gdip_SaveBitmapToFile(pBitmap_part, file)
	Gdip_SaveBitmapToFile(pBitmap, file)
	Gdip_DisposeImage(pBitmap)
	;Gdip_DisposeImage(pBitmap_part)
	Gdip_Shutdown(pToken)
	
	}else{
	MsgBox, windows doesn't exist
}
exitapp

