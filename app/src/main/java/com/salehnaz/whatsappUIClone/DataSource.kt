package com.salehnaz.whatsappUIClone

import com.salehnaz.whatsappUIClone.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Saleh",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://media-exp1.licdn.com/dms/image/C5603AQF5ImX0u4mVdg/profile-displayphoto-shrink_800_800/0/1618342727627?e=1625097600&v=beta&t=H_irNb1eiA1My5C7_6O9EG4fZBkFZGGoUHlC_Dst4JY"
                )
            )
            list.add(
                BlogPost(
                    "Mitch",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://avatars.githubusercontent.com/u/17446480?v=4"
                )
            )

            list.add(
                BlogPost(
                    "Asim",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "https://st2.depositphotos.com/1006318/5909/v/600/depositphotos_59095205-stock-illustration-businessman-profile-icon.jpg"
                )
            )
            list.add(
                BlogPost(
                    "Thejus",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "https://i.pinimg.com/474x/85/34/dd/8534dd46ef1e43b2d5ac8ec6dedbd22d.jpg"
                )
            )
            list.add(
                BlogPost(
                    "Anand",
                    "Freelancing as an Android developer with Donn Felker.\\r\\n\\r\\nDonn is also:\\r\\n\\r\\n1) Founder of caster.io\\r\\n\\r\\n2) Co-host of the fragmented podcast (fragmentedpodcast.com).",
                    "https://us.123rf.com/450wm/yupiramos/yupiramos1610/yupiramos161007352/64369849-young-man-avatar-isolated-icon-vector-illustration-design.jpg?ver=6"
                )
            )
            list.add(
                BlogPost(
                    "Ashish",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRX8s7dXR1sd8qdWGJ_CV1SD-Swi6xMkH2y0w&usqp=CAU"
                )
            )
            list.add(
                BlogPost(
                    "Midhilaj",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "https://cdni.iconscout.com/illustration/premium/thumb/hindu-male-2885385-2394032.png"
                )
            )
            list.add(
                BlogPost(
                    "Jeffi",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ1t2yZyxxWF6E-sSdd-6pUD2qWFoG6eEOaA&usqp=CAU"
                )
            )
            list.add(
                BlogPost(
                    "Rijin ",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "https://us.123rf.com/450wm/rastudio/rastudio1503/rastudio150300073/37219154-the-hipster-with-a-beard-is-laughing-fun-concept-vector-flat-design-illustration.jpg?ver=6"
                )
            )
            return list
        }
    }
}