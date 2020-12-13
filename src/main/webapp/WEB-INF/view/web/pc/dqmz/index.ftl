<!DOCTYPE html>
<#import "/spring.ftl" as spring/>
<html class="no-js" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
    <link rel="shortcut icon" href="<@spring.url '/resources/common/images/favicon.ico'/>" type="image/x-icon">
    <title>:: A PhotoWall For DQ ::</title>

    <!-- CSS include -->
    <link rel="stylesheet" href="<@spring.url '/resources/common/css/normalize.css'/>" type="text/css">
    <link href="<@spring.url '/resources/common/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css">
    <link href="<@spring.url '/resources/common/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="<@spring.url '/resources/common/css/foundation.min.css'/>" type="text/css">

    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/pc/dqmz/css/set1.css'/>"/>
    <link rel="stylesheet" href="<@spring.url '/resources/pc/dqmz/css/main.css'/>" type="text/css">
    <link href="<@spring.url '/resources/pc/dqmz/css/responsive.css'/>" rel="stylesheet" type="text/css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<!-- header -->
<header id="header" class="header">
    <div class="container-fluid">
        <hgroup>
            <!-- logo -->
            <h1> <a href="index.ftl" title="Picxa"><img src="<@spring.url '/resources/pc/dqmz/images/logo.png'/>" alt="Picxa" title="Picxa"/></a> </h1>
            <!-- logo -->
            <!-- nav -->
            <nav>
                <div class="menu-expanded">
                    <div class="nav-icon">
                        <div id="menu" class="menu"></div>
                        <p>menu</p>
                    </div>
                    <div class="cross"><span class="linee linea1"></span> <span class="linee linea2"></span> <span
                            class="linee linea3"></span></div>
                    <div class="main-menu">
                        <ul>
                            <li class="active"><a href="../account/index.ftl">Home</a></li>
                            <li><a href="about.html">About</a></li>
                            <li><a href="blog.html">blog</a></li>
                            <li><a href="contact.html">contact</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- nav -->
        </hgroup>
    </div>
</header>

<!-- header -->
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/">企业网站模板</a></div>

<main class="main-wrapper" id="container">

    <!-- image Gallery -->

    <div class="wrapper">
        <div class="">
            <ul class="small-block-grid-2 medium-block-grid-3 large-block-grid-3 masonry">
        <#list imageList as image>
            <li class="masonry-item grid">
                <figure class="effect-sarah"><img src="<@spring.url '/resources/pc/dqmz/images/gallery/${image.id}.jpg'/>"
                                                  alt=""/>
                    <figcaption>
                        <h2>${image.title} <span>${image.subTitle}</span></h2>
                        <p>${image.description}.</p>
                        <a href="javascript:void(0)">View more</a></figcaption>
                </figure>
            </li>
        </#list>
            </ul>
        </div>
    </div>
</main>

<!-- Image Gallery -->

<!-- footer -->

<footer class="footer">
    <h3>开心不，以后不要抛弃“你的人”了</h3>
    <div class="container footer-bot">
        <div class="row">

            <!-- logo -->

            <div class="col-xs-12 col-sm-6 col-md-3 col-lg-3"><img
                    src="<@spring.url '/resources/pc/dqmz/images/footer-logo.png'/>" alt="Picxa" title="Picxa"/>
                <p class="copy-right">&copy; Reserved wang ming 2018.</p>
            </div>

            <!-- logo -->

            <!-- address -->

            <div class="col-xs-12 col-sm-6 col-md-3 col-lg-3 padding-top">
                <address>
                    <p>200 Broadway Av</p>
                    <p>West Beach SA 5024 Australia</p>
                </address>
            </div>

            <!-- address -->

            <!-- email -->

            <div class="col-xs-12 col-sm-6 col-md-3 col-lg-3 padding-top">
                <p><a href="mailto:346129023@qq.com">346129023@qq.com</a></p>
                <p>01 (2) 34 56 78</p>
            </div>

            <!-- email -->

            <!-- social -->

            <div class="col-xs-12 col-sm-6 col-md-3 col-lg-3 padding-top">
                <ul class="social">
                    <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fa fa-flickr" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fa fa-tripadvisor" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
                    <li><a href="#"><i class="fa fa-delicious" aria-hidden="true"></i></a></li>
                </ul>
                <p class="made-by">Made with by <i class="fa fa-heart" aria-hidden="true"></i> <a
                        href="javascript:void(0)" target="_blank">Designstub</a>
                <p>
            </div>

            <!-- social -->

        </div>
    </div>
</footer>

<!-- footer -->

<!-- JS include -->
<script src="<@spring.url '/resources/common/js/jquery.min.js'/>"></script>
<script src="<@spring.url '/resources/common/js/jquery.contact.js'/>" type="text/javascript"></script>
<script src="<@spring.url '/resources/common/js/jquery.infinitescroll.min.js'/>" type="text/javascript"></script>
<script src="<@spring.url '/resources/common/js/jquery.nicescroll.min.js'/>" type="text/javascript"></script>
<script src="<@spring.url '/resources/common/js/bootstrap.min.js'/>" type="text/javascript"></script>
<script src="<@spring.url '/resources/common/js/masonry.pkgd.min.js'/>" type="text/javascript"></script>
<script src="<@spring.url '/resources/common/js/imagesloaded.pkgd.min.js'/>" type="text/javascript"></script>
<script src="<@spring.url '/resources/common/js/modernizr-2.8.3.min.js'/>" type="text/javascript"></script>

<script src="<@spring.url '/resources/pc/dqmz/js/plugins.js'/>" type="text/javascript"></script>
<#--<script src="<@spring.url '/resources/pc/dqmz/js/maps.js'/>" type="text/javascript"></script>-->
<script src="<@spring.url '/resources/pc/dqmz/js/custom.js'/>" type="text/javascript"></script>
<script src="<@spring.url '/resources/pc/dqmz/js/main.js'/>" type="text/javascript"></script>
</body>
</html>