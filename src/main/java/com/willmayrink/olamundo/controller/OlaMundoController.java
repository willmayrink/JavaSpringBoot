package com.willmayrink.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

    @GetMapping("/")
    public String olaMundo() {
        return htmlRender();
    }

    public String htmlRender() {
        String htmlCode = """
                          <!doctype html>\r
                          <html lang="en" data-bs-theme="dark">\r
                            <head>\r
                              <meta charset="utf-8">\r
                              <meta name="viewport" content="width=device-width, initial-scale=1">\r
                              <title>Bootstrap demo</title>\r
                              <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">\r
                              <style>
                                .bg-indigo{
                                  background-color: var(--bs-indigo) !important;
                                }
                              </style>
                              <link rel="preconnect" href="https://fonts.googleapis.com">    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">  </head>\r
                            <body>\r
                              
                              <div class="container d-flex justify-content-center ps-5 pt-5">
                                <span class="display-3" style="font-family='Roboto',sans-serif;">we'll make history.</span>\r
                                <span class="position-absolute" style="vertical-align:middle;">
                                  <div class="container d-flex-none top-0 position-absolute start-100 translate-middle ms-5">
                                    <div class="d-inline-flex ps-5 ms-5">
                                        <span class="badge text-bg-success rounded-2 fw-bold">SpringBoot</span>
                                        <span class="badge bg-indigo rounded-2 fw-bold ms-1">Bootstrap</span>
                                        <span class="badge text-bg-primary rounded-2 fw-bold ms-1">JDK 17</span>
                                    </div>                                
                                  </div>
                                </span>
                              </div>
                              <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js" integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq" crossorigin="anonymous"></script>\r
                            </body>\r
                          </html>""" //
                //
                //
                //
                //
                //
                //
                //
                //
                //
                //
                //
                //
                //
                //
                ;
        return htmlCode;
    }
}
