#cs ----------------------------------------------------------------------------

 AutoIt Version: 3.3.8.1
 Author:         myName

 Script Function:
	Template AutoIt script.

#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here
Run("notepad.exe")
WinWaitActive("Sin t�tulo: Bloc de notas")
Send("probando en comando sende")
WinClose("Sin t�tulo: Bloc de notas")
WinWaitActive("Bloc de notas", "guardar")
Send("!n")
